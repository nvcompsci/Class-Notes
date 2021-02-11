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
### Basic POST Request
``` js
const user = {
    username: “jword”,
    password: “1234abc”
}
const config = {
    method: "POST",
    body: JSON.stringify( {user} ),
    headers: {
        "Content-Type":"application/json"
    }
}
fetch("/login”,config)
    .then( response => response.json() )
    .then( ratings => console.log(ratings) )
    .catch(err => console.error(err))
```
## Server-Side Development
### Setup express server
``` bash
#uses Node Package Manager to install express framework
npm install express ```

``` js
//Import express framework
const express = require("express")
//Initialize server object
const app = express()

//Parse request data coming in
app.use(express.json())
//Serve ‘public’ folder as static website
app.use( express.static('public') )

//basic GET request handler
app.get("/hello", (req, res) => {
    res.send("Hello, world!")
})

//Listens for web requests
app.listen(80, () => console.log("Server started") )

```

