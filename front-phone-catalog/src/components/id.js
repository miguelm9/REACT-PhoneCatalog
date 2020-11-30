import React from "react";
import axios from "axios";

function PrintDetails (props) {
    getData(props.id);

    axios
      .get("http://localhost:8080/details")
      .then(response => {
        // create an array of phones only with relevant data
        const newContacts = response.data.map(c => {
          return {
            id: c.id,
            name: c.name,
            image: c.imageFileName,
          };
        });

        // create a new "state" object without mutating
        // the original state object.
        const newState = Object.assign({}, this.state, {
          contacts: newContacts
        });

        // store the new state object in the component's state
        this.setState(newState);
      })
      .catch(error => console.log(error));
    return (
    <div>ID FROM YES: {props.id}</div>
  );
}

async function getData (id) {
  const url = 'http://localhost:8080/details';

  const userJSON = {
      id: id
  };

  const options = {
      method: 'POST',
      body: JSON.stringify(userJSON),
      headers: {
          'Content-Type': 'application/json'
      }
  }

  let response =  await fetch(url, options);
  
  console.log(response.json());
}

export default PrintDetails;
