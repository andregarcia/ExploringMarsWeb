<html>

	<head>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script>
			$(document).ready(function(){
    			$("#sendButton").click(function(){
    				var inputLines = $("textarea#inputTextarea").val();
        			$.post("explore/mars?form",
        				{input: inputLines},
        				function(data,status){
        					$("textarea#outputTextarea").val(data);
        				}).fail(function(data){
        					alert(data.responseText);
        				});
    			});
    			
    			$("#clearButton").click(function(){
    				$("textarea#outputTextarea").val("");
    			});
    			
			});
			
			
			
		</script>
	</head>

	<body>
	
	
		<!-- title -->
		<div style="width:600px; margin-left:auto; margin-right:auto; margin-top:50px; text-align:center">
			<h1>Welcome to Mars Explorer!</h1>
		</div>
		
		
		
		<!-- labels div -->
		<div style="width:600px;margin:0px auto; margin-top:50px">
		
			<div style="display:inline;float:left;width:300px; text-align:center">
				Input
			</div>
		
			<div style="display:inline;float:left;width:300px; text-align:center">
				Output
			</div>
		
		</div>
		
		
		
		<!-- textarea divs -->
		<div style="width:600px;margin:0px auto; margin-top:50px">
		
			<div style="display:inline;float:left;width:300px">
				<textarea id="inputTextarea" cols="30" rows="20" style="margin-left:20px"></textarea>
			</div>
		
			<div style="display:inline;float:left;width:300px">
				<textarea id="outputTextarea" cols="30" rows="20" style="margin-left:20px"></textarea>
			</div>
		
		</div>
		
		
		<!-- buttons div -->
		<div style="width:600px;margin:0px auto; margin-top:50px">
		
			<div style="display:inline;float:left;width:300px; text-align:center">
				<input type="button" 
						id="sendButton"
						value="Send probes!" 
						style="margin:auto"/>
			</div>
		
			<div style="display:inline;float:left;width:300px; text-align:center">
				<input type="button" 
						id="clearButton"
						value="Destroy probes!" 
						style="margin:auto"/>
			</div>
		
		</div>
		
		
		
	</body>
</html>
