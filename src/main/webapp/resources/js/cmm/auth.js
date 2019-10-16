"use strict";
var auth = auth || {};

auth = (()=>{
	
	let _, js;
		
	let init =()=> {
		_=$.ctx();
		js=$.js();
	}
	
	let onCreate =()=>{
		init();
		$('#a_go_join').click(()=>{
			alert('회원가입 화면으로 이동');
		});
		
	}
			
	return{onCreate:onCreate}
	
})();