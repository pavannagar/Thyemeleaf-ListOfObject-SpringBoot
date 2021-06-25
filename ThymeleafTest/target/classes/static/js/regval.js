	
		const firstName=document.getElementById('firstName');
		const lastName=document.getElementById('lastName');
		const email=document.getElementById('email');
		const password=document.getElementById('password');
		const form=document.getElementById('form');
		form.addEventListener('submit',(event)=>{

			event.preventDefault();
			validate();
			
		})
	
		
		const sendData=(count,sRate)=>{
			if(count===sRate){
				$('form').get(0).submit();
			}
		}
		
		const successMsg = () =>{
			let formCon = document.getElementsByClassName('form-control');
			var count=formCon.length-1;
			for(var i=0;i<formCon.length;i++){
				if(	formCon[i].className==="form-control success"){
					var sRate=0+i;
					console.log(sRate);
					sendData(count,sRate);
				}else{
					return false;
				}
			}
			
			
		}
		
		const validate = () =>{
			console.log("inside validate")
			
			//first name validation
			if(firstName.value==''){
				console.log("inside validate iff")
				setErrorMsg(firstName,'please provide first name');
			}else{
				setSuccessMsg(firstName);
				//document.getElementById("firstName").style.borderColor = "#2ecc71";
			}
			
			//last name validation
			if(lastName.value==''){
				console.log("inside validate iff")
				setErrorMsg(lastName,'please provide last name');
			}else{
				setSuccessMsg(lastName);
				//document.getElementById("firstName").style.borderColor = "#2ecc71";
			}
			
			//email validation
			if(email.value==''){
				console.log("inside validate iff")
				setErrorMsg(email,'please provide valid email');
			}else{
				setSuccessMsg(email);
				//document.getElementById("firstName").style.borderColor = "#2ecc71";
			}
			
			
			//password validation
			if(password.value==''){
				console.log("inside validate iff")
				setErrorMsg(password,'please provide password');
			}else if(password.value.length < 4){
				console.log("inside password "+password.length)
				setErrorMsg(password,'password must be atleast 4 character');
			}
			else{
				setSuccessMsg(password);
				//document.getElementById("firstName").style.borderColor = "#2ecc71";
			}
			
			
		
			successMsg();
		}
		
		function setSuccessMsg(input){
			input.className="form-control success";
			//$('form').get(0).submit();
			
		}

		function setErrorMsg(input,errormsg) {
			// body...
			//var element = document.getElementById("firstName");
 			 //element.classList.add("is-invalid");
			console.log("inside setErrorMsg")
			const formControl=input.parentElement;
			const small=formControl.querySelector('span');
			input.className="form-control is-invalid";
			small.innerText=errormsg;
			console.log(errormsg);
			  
		}
