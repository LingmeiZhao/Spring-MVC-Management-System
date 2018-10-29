package org.company.controllers;

import org.company.models.Employee;
import org.company.models.Methods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class EmployeeController {

    Methods methods = new Methods();

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        Employee employee = new Employee();
        return new ModelAndView("employeeAdd", "employee", employee);
    }

    @RequestMapping(value = "/displayEmployee", method = RequestMethod.GET)
    public String displayForm() {
        return "employeeAdd";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        } else {
            methods.addEmployee(employee.getId(), employee.getName(), employee.getGender(),
                    employee.getSalary(), employee.getDepartment());
            return "index";
        }
      /*model.addAttribute("id", employee.getId());
        model.addAttribute("name", employee.getName());
        model.addAttribute("gender",employee.getGender());
        model.addAttribute("salary", employee.getSalary());
        model.addAttribute("department", employee.getDepartment());
        return "employeeView";*/
    }

    @RequestMapping(value ="/employeeDelete", method = RequestMethod.GET)
    public String employeeDelete(){
        return "deleteEmployee";
    }

    @RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
    public String deleteEmployee(@ModelAttribute("id") long id,
                                 BindingResult result, Model model)
    {
        if(methods.canDelete(id) == false)
        {
            return "error";
        }
        else
        {
            methods.deleteEmployee(id);
            return "index";
        }

    }

    @RequestMapping(value ="employeeFind", method = RequestMethod.GET)
    public String employeeFind()
    {
        return "findEmployee";
    }

    @RequestMapping(value="/findEmployee",method = RequestMethod.POST)
    public String findEmployee(@ModelAttribute("id") long id,
                               BindingResult result, Model model)
    {
        if(methods.canFindEmployee(id) == false)
        {
            return "error";
        }else
        {
            Employee employee = methods.findEmployee(id);
            String person =  "<tr><td>" + "ID:  " + employee.getId() + " </td> " +
                            "<td>" + "Name: " + employee.getName() + "</td>" +
                            "<td>" + "Gender: " + employee.getGender() + "</td>" +
                            "<td>" + "Salary: " + employee.getSalary() + " </td> " +
                            "<td>" + "Department: " + employee.getDepartment()+ "</td></tr>";
            model.addAttribute("result", String.join("\n", person));
            return "displayTheFindResult";
        }
    }

    @RequestMapping(value ="/informationModification", method= RequestMethod.GET)
    public String informationModification()
    {
        return "modificationInfo";
    }

    @RequestMapping(value ="/modificationInfo", method = RequestMethod.POST)
    public String modificationInfo(@ModelAttribute("id") long id,
                                   BindingResult result, Model model)
    {
        if(methods.canModification(id)==false)
        {
            return "error";
        }else
        {
            Employee employee = methods.modificationInfo(id);
            methods.deleteEmployee(id);
            String person =  "<tr><td>" + "ID:  " + employee.getId() + " </td> " +
                    "<td>" + "Name: " + employee.getName() + "</td>" +
                    "<td>" + "Gender: " + employee.getGender() + "</td>" +
                    "<td>" + "Salary: " + employee.getSalary() + " </td> " +
                    "<td>" + "Department: " + employee.getDepartment()+ "</td></tr>";
            model.addAttribute("Information", String.join("\n", person));
            return "employeeModification";
        }
    }

    @RequestMapping(value = "/viewEmployee", method = RequestMethod.GET)
    public String viewEmployee(Model model) {
        String[] strings = methods.displayEmployee();
        model.addAttribute("data", String.join("\n", strings));
        return "employeeView";
    }

    @RequestMapping(value = "/raiseError", method = RequestMethod.POST)
    public String raiseError(@ModelAttribute("employee") Employee employee,
                             BindingResult result, ModelMap model) {
        return "error";
    }


}
