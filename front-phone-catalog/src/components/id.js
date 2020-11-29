import React from "react";
import axios from "axios";

function PrintDetails (props) {
    axios
      .get("http://localhost:8080/phones")
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

export default PrintDetails;
