package a.b.c.kos.mem.controller;

import java.util.HashMap;



public class HandlerMapping {
  private HashMap<String, Controller> mappings;
  public HandlerMapping() {
	  mappings=new HashMap<String, Controller>();
	  mappings.put("/memberList.do", new MemberListController());
	  mappings.put("/memberSearch.do", new MemberSearchController());
	  mappings.put("/memberInsert.do", new MemberInsertController());
	  mappings.put("/memberContent.do", new MemberContentController());
	  mappings.put("/memberUpdate.do", new MemberUpdateController());
	
  }
  public Controller getController(String key) { // key=>/memberList.do
	  return mappings.get(key);
  }
}