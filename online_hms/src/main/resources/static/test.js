var myForm=document.forms.myForm;
var message=document.getElementById("message");
myFrom.onsubmit=function(){
	if(myFrom.name.value==""){
		message.innerHTML="please enter a name";
		return false;
	}else{
		message.innerHTML="";
		return true;
	}
};