package tk.tukuteam.ayudacompraApi.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.Address;
import tk.tukuteam.ayudacompraApi.model.HelpRequest;
import tk.tukuteam.ayudacompraApi.model.UserApp;
import tk.tukuteam.ayudacompraApi.repository.AddressRepository;
import tk.tukuteam.ayudacompraApi.repository.HelpRequestRepository;
import tk.tukuteam.ayudacompraApi.repository.ItemRepository;
import tk.tukuteam.ayudacompraApi.repository.UserAppRepository;
import tk.tukuteam.ayudacompraApi.viewModel.HelpRequestViewModel;
import tk.tukuteam.ayudacompraApi.viewModel.ItemViewModel;

@RestController
@RequestMapping(value="/api/v1/helprequest")
public class HelpRequestController {
	@Autowired
	private HelpRequestRepository HelpRequestRepo;
	@Autowired
	private UserAppRepository UserAppRepo;
	@Autowired
	private AddressRepository AddressRepo;
	@Autowired
	private ItemRepository ItemRepo;
	
	@GetMapping("/")
	public List<HelpRequestViewModel> getHelpRequests(){
		ArrayList<HelpRequestViewModel> reqviews = new ArrayList<>();
		HelpRequestRepo.findAll().forEach(req -> {
				HelpRequestViewModel reqview = new HelpRequestViewModel();
				UserApp user = UserAppRepo.findById(req.getIdUserNeedy()).get();
				Address addr = AddressRepo.findById(req.getIdAddress()).get();
				reqview.setName(user.getFirstName() + " " + user.getLastName());
				reqview.setAvatar(user.getProfileUrl());
				reqview.setAddress(addr.getAddressName() + " " + addr.getAddressNumber());
				reqview.setId(req.getIdHelpRequest().toString());
				reqviews.add(reqview);
		});
		return reqviews;
	}
	
	@GetMapping("/details")
	public List<HelpRequest> getHelpRequestsDetails(){
		List<HelpRequest> r = new ArrayList<>();
		HelpRequestRepo.findAll().forEach(f -> {
			r.add(f);
		});
		return r;
	}
	
	@GetMapping("/{id}/items")
	public List<ItemViewModel> getItemsFromRequest(@PathVariable("id") String id){
		var itemList = new ArrayList<ItemViewModel>();
		var items = ItemRepo.findByIdHelpRequest(UUID.fromString(id));
		items.forEach(item -> {
			ItemViewModel itemView = new ItemViewModel();
			itemView.setId(item.getIdItems().toString());
			itemView.setName(item.getItemName());
			itemView.setQuantity(""+item.getQuantity());
			itemList.add(itemView);
		});
		return itemList;
	}
	
	@GetMapping("/{title}")
	public List<HelpRequest> getTitlefromHelpRequest(@PathVariable("title") String title){
		return HelpRequestRepo.findBytitle(title);	
	}
	
	@GetMapping("/{dateCreated}")
	public List<HelpRequest> getDateCreatedfromHelpRequest(@PathVariable("dateCreated") Date dateCreated){
		return HelpRequestRepo.findByDateCreated(dateCreated);
	}
	
	@GetMapping("/{dateExpiration}")
	public List<HelpRequest> getDateExpirationfromHelpRequest(@PathVariable("dateExpiration") Date dateExpiration){
		return HelpRequestRepo.findByDateExpiration(dateExpiration);	
	}
	
	@GetMapping("/{dateCompleted}")
	public List<HelpRequest> getDateCompletedfromHelpRequest(@PathVariable("dateCompleted") Date dateCompleted){
		return HelpRequestRepo.findByDateCompleted(dateCompleted);	
	}
	
	@GetMapping("/{idUserNeedy}")
	public List<HelpRequest> getIdUserNeedyfromHelpRequest(@PathVariable("idUserNeedy") UUID idUserNeedy){
		return HelpRequestRepo.findByIdUserNeedy(idUserNeedy);	
	}
	
	@GetMapping("/{idAddress}")
	public List<HelpRequest> getIdAddressNeedyfromHelpRequest(@PathVariable("idAddress") UUID idAddress){
		return HelpRequestRepo.findByIdAddress(idAddress);	
	}
	
	@GetMapping("/{idCommentOrder}")
	public List<HelpRequest> getIdCommentOrderfromHelpRequest(@PathVariable("idCommentOrder") UUID idCommentOrder){
		return HelpRequestRepo.findByIdCommentOrder(idCommentOrder);	
	}
		
	@GetMapping("/{idUserHelper}")
	public List<HelpRequest> getIdUserHelperfromHelpRequest(@PathVariable("idUserHelper") UUID idUserHelper){
		return HelpRequestRepo.findByIdUserHelper(idUserHelper);	
	}
	
	@GetMapping("/{idHelpRequestStatus}")
	public List<HelpRequest> getIdHelpRequestStatusfromHelpRequest(@PathVariable("idHelpRequestStatus") UUID idHelpRequestStatus){
		return HelpRequestRepo.findByIdHelpRequestStatus(idHelpRequestStatus);
	}
	
	

}
