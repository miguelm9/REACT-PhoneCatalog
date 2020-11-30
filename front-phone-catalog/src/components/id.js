import React, { Component } from "react";
import axios from "axios";
import "../App.css";
import DetailsList from "./DetailsList";

class PrintDetails extends Component {
  state = {
    details: []
  };
  componentDidMount() {
    axios
    .post('http://localhost:8080/details', {
      id: this.props.id,
    })
    .then(response => {
      const newDetails = response.data.map(c => {
        return {
          id: c.id,
          name: c.name,
          image: c.imageFileName,
        };
      });
      const newState = Object.assign({}, this.state, {
        details: newDetails
      });

      this.setState(newState);
    })
    .catch(error => console.log(error));
  }
  render() {
    return (
      <div className="App">
        <DetailsList details={this.state.details} />
      </div>
    );
  }
}


export default PrintDetails;
