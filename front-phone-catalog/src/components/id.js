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
          manufacturer: c.manufacturer,
          description: c.description,
          color: c.color,
          price: c.price,
          screen: c.screen,
          processor: c.processor,
          ram: c.ram,
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
