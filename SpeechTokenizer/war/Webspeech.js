/**
 * Autor: Verena Hofmann
 */


var sttResult = '';	
var recognizing = false;
var ignore_onend;


	if (!('webkitSpeechRecognition' in window)) { 
			//Hier wird geprüft, ob der Browser die Web Speech API unterstützt. Falls nicht wird er aufgefordert den Browser upzudaten.
			upgrade ();
		} else {
			/*Erlaubt der Seite Zugriff auf das Mikrofon - webkitSpeechRecognition Objekt stellt das Speech Interface bereit und definiert Eventhandler*/
			//That is the object that will manage our whole recognition process.
			var recognition = new webkitSpeechRecognition();
  			/* Continous: true = User kann Pause einlegen, bei false wird sofort geschickt sobald pause*/
  			recognition.continuous = true;
	
			//Listening (capturing voice from audio input) started.
			recognition.onstart = function() {
    			recognizing = true;
    	  		var micstatuselement = document.getElementById('micstatus');
    	  		
    	  		/**
    	  		 * Outcomment the next two lines for tests on local server.
    	  		 * You need the two lines just for App Engine.
    	  		 */
    	  		micstatuselement.style.color='green';
    	  		micstatuselement.innerHTML='Mic aktiv';
  			};
  			  	
  			recognition.onend = function() {
    			recognizing = false;
    			if (ignore_onend) {
      				return;
    			}
    	  		var micstatuselement = document.getElementById('micstatus');
    	  		
    	  		/**
    	  		 * Outcomment the next two lines for tests on local server.
    	  		 * You need the two lines just for App Engine.
    	  		 */
    	  		micstatuselement.removeAttribute('style');
    	  		micstatuselement.innerHTML='Mic inaktiv';

  	};
  		
  	
  	recognition.onresult = function(event) {
    			for (var i = event.resultIndex; i < event.results.length; ++i) {
      				if (event.results[i].isFinal) {
      					//the text representation of a word.
        				sttResult = event.results[i][0].transcript;
      				}
      				
      				//Aufruf der Token Funktion in Token.js      				
      				Token();
      				
    			}
    			/*linebreak für neuen Paragraphen, wird dann in HTML übersetzt*/
    			sttResult = capitalize(sttResult);
    			
    			/*final_span Anzeige in HTML*/
    			final_span.innerHTML = linebreak(sttResult);
  			};
  }
  				
  			
/*Wird nach Drücken auf den Start-Button aufgerufen*/
function startButton(event) {	
	if (recognizing) {
    	recognition.stop();
    	return;
  	}
	console.log("Service gestartet");
	sttResult = '';
	/*aktiviert den Speech Recognizer und ruft onstart Eventhandler auf*/
	recognition.start();
	ignore_onend = false;
	final_span.innerHTML = '';
}
	
function refreshButton(event) {	
	console.log("Service refreshed");


	var Document = new Object();
		Document.userId = "hangoutF2AA23F4_ephemeral.id.google.com^b005d30bf33378"
		Document.hangoutsId = "AP36tYfMptB_3_cJW6AOwyJAIgAdMt5jKh6lyqVUTFVSapjVT0fRNg"
	   	Document.documentName = "Endpoint"
	   	Document.drivePath = "http://drive.google.com/open?id=1vJNvuPnCwg37yKZRsRuWvDn_LIwF5N4nHm_Xm1SIn8g"
	   		
	
	
//Asynchron Post Request to own interface for testing
$.ajax({ type:'POST', 
	url: 'https://146.148.67.230/de.hdm.speechtomcat/rest/PostDocuments',  
	data: JSON.stringify(Document),
	contentType: 'application/json',
	datatyp: 'json',

	//Fehler loggen 
    error: function(){
        console.log("Error");
    },

	//Bei erfolgreichem Request Objekt in der Console ausgeben
    success: function(responsedata){
    	console.log("success");
    	console.log(Document);
    		
    	}
});
}

function ipButton(event) {	
	console.log("Service gibt ID");

	   		
	
//Asynchron Post Request to own interface for testing
$.ajax({ type:'GET', 
	url: 'https://146.148.67.230/de.hdm.speechtomcat/rest/register',  
	contentType: 'application/x-www-form-urlencoded',
	datatyp: 'text',

	//Fehler loggen 
    error: function(){
        console.log("Error");
    },

	//Bei erfolgreichem Request Objekt in der Console ausgeben
    success: function(responsedata){
    	console.log("success");
    	console.log(responsedata);
    		
    	}
});
}
/* Durch linebreak und capatilize wird Text in Box eingeblendet*/

function linebreak(sttResult) {
	return sttResult;
}

function capitalize(sttResult) {
	return sttResult;
}
