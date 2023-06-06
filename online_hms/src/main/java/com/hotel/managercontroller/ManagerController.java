package com.hotel.managercontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hotel.exception.RecordNotFoundException;
import com.hotel.managerentity.AddRoom;
import com.hotel.managerentity.AddStaffEntity;
import com.hotel.managerentity.ManagerLogin;
import com.hotel.managerentity.ManagerRegister;
import com.hotel.managerrepository.AddRoomRepository;
import com.hotel.managerrepository.ManagerRegisterRepository;
import com.hotel.managerservice.AddRoomService;
import com.hotel.managerservice.AddStaffService;
import com.hotel.managerservice.ManagerLoginService;
import com.hotel.managerservice.ManagerRegisterService;
import com.hotel.receptionistentity.Login;

@Controller
//@RequestMapping("/abcd")
public class ManagerController {
	@Autowired
	AddStaffService services;
	@Autowired
	private ManagerRegisterService managerRegisterService;
	@Autowired
	private ManagerLoginService ManagerLoginService;
	@Autowired
	private AddRoomService addRoomService;

	@Autowired
	private AddRoomRepository addRoomRepository;

	@Autowired
	AddRoomService service;

	@Autowired
	private ManagerRegisterRepository managerregisterrepository;

	@GetMapping("/managerregister")
	public String managerRegister() {
		return "managerregister";
	}

	@GetMapping("/managerlogin")
	public String managerLogin() {
		return "managerlogin";
	}

	@PostMapping("/managerregisters")
	public String addManagerRegisterDetails(@ModelAttribute("userss") ManagerRegister managerRegister) {

		if (managerregisterrepository.findByEmail(managerRegister.getEmail()) != null) {
			return "errr";
		}

		else {
			ManagerLogin managerlogin = new ManagerLogin();
			managerlogin.setEmail(managerRegister.getEmail());
			managerlogin.setPassword(managerRegister.getPassword());
			managerRegisterService.addDetails(managerRegister);
			ManagerLoginService.addDetails(managerlogin);
			return "managerlogin";

		}

	}

	@PostMapping("/checking")
	public String loginSubmit(@ModelAttribute ManagerLogin login, Model model) {
		ManagerRegister registration = managerregisterrepository.findByEmail(login.getEmail());
		if (registration != null && registration.getPassword().equals(login.getPassword())
				&& registration.getEmail().equals(login.getEmail())) {
			// Successful login

			model.addAttribute("loginSuccess", true);
			return "alert1";

		} else {
			// Invalid credentials
			model.addAttribute("errorMessage", "Invalid email or Password");
			return "managerlogin";
		}
	}

	@GetMapping("/afterlogin")
	public String afterManagerLogin() {
		return "aftermanagerlogin";
	}

	@RequestMapping("/rooms")
	public String getAllEmployees(Model model) {
		List<AddRoom> list = service.getAllEmployees();

		model.addAttribute("employees", list);
		return "list-employees";
	}

	@RequestMapping(path = { "/edit", "/edit/{id}" })
	public String editEmployeeById(Model model, @PathVariable("id") Optional<Long> id) throws RecordNotFoundException {
		if (id.isPresent()) {
			AddRoom entity = service.getEmployeeById(id.get());
			model.addAttribute("employee", entity);
		} else {
			model.addAttribute("employee", new AddRoom());
		}
		return "add-edit-employee";
	}

	@RequestMapping(path = "/delete/{id}")
	public String deleteEmployeeById(Model model, @PathVariable("id") Long id) throws RecordNotFoundException {
		service.deleteEmployeeById(id);
		return "redirect:/rooms";
	}

	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
	public String createOrUpdateEmployee(AddRoom employee) {
		service.createOrUpdateEmployee(employee);
		return "redirect:/rooms";
	}

	@GetMapping("/addRoom")
	public String addRoom() {
		return "redirect:/rooms";
	}

	@RequestMapping("/staff")
	public String getAllEmployee(Model model) {
		List<AddStaffEntity> list = services.getAllEmployees();

		model.addAttribute("employees", list);
		return "list-staff";
	}

	@RequestMapping(path = { "/edits", "/edits/{id}" })
	public String editEmployeesById(Model model, @PathVariable("id") Optional<Long> id) throws RecordNotFoundException {
		if (id.isPresent()) {
			AddStaffEntity entity = services.getEmployeeById(id.get());
			model.addAttribute("employee", entity);
		} else {
			model.addAttribute("employee", new AddStaffEntity());
		}
		return "add-edit-staff";
	}

	@RequestMapping(path = "/deletes/{id}")
	public String deleteEmployeesById(Model model, @PathVariable("id") Long id) throws RecordNotFoundException {
		services.deleteEmployeeById(id);
		return "redirect:/staff";
	}

	@RequestMapping(path = "/createEmployees", method = RequestMethod.POST)
	public String createOrUpdateEmployee(AddStaffEntity employee) {
		services.createOrUpdateEmployee(employee);
		return "redirect:/staff";
	}

	@GetMapping("/addStaff")
	public String addStaff() {
		return "redirect:/staff";
	}

}
