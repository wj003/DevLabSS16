/**
 * Autor: Benjamin Mecheels
 */

var serverPath = '//speech-tokenizer-1282.appspot.com/';

function initUi(){
	var hangoutsid = getUserData('id');
	var hangoutsidelement = document.getElementById('hangoutsid');
	hangoutsidelement.innerHTML=hangoutsid;
	console.log(hangoutsid);
	var marenid = getHangoutId(),
	console.log(marenid);
}

function registerClient(){
	  $.ajax({type:'GET', 
		  url:'http://146.148.67.230/rest/register',
		  dataType: 'http',
		 
		//Fehler loggen 
		error: function(){
	    	console.log("Error");
		},
		
		// Anfrage erfolgreich
		success: function(responseData){
			console.log('ERFOLGREICH');
			console.log(responseData);
		}
	  });
}

// A function to be run at app initialization time which registers the callbacks
function init() {
  console.log('Init app.');

  var apiReady = function(eventObj) {
    if (eventObj.isApiReady) {
      console.log('API is ready');
      
      initUi();
      
      /*gapi.hangout.data.onStateChanged.add(function(eventObj) {
        hangoutsid(eventObj.state);
      });
      /*gapi.hangout.onParticipantsChanged.add(function(eventObj) {
        updateParticipantsUi(eventObj.participants);
      });*/
      
      gapi.hangout.onApiReady.remove(apiReady);
    }
  };

  // This application is pretty simple, but use this special api ready state
  // event if you would like to any more complex app setup.
  gapi.hangout.onApiReady.add(apiReady);
}

gadgets.util.registerOnLoadHandler(init);
