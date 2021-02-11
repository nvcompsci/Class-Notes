# Unit 3: Servers & Networking

## Send HTTP Requests from Client
### Basic GET request
``` js
fetch('/items')
    //convert server response to JS
    .then( response => response.json() )
    //do something with parsed response
    .then( items => console.log(items) )
    //handle any possible errors
    .catch( err => console.error(err) )

```
