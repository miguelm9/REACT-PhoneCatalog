import React from "react";
import logo from './components/gs-logo.png';
import "./App.css";
import {Link} from 'react-router-dom';
import { selectActiveID } from './store/phone/reducer';
import {updateWord} from "./store/phone/action"
import {connect} from 'react-redux';
import LeID from './components/id'

// class Details extends Component {

//   state = {
//     contacts: []
//   };

//   componentDidMount() {
//     axios
//       //.get("httyps://jsonplaceholder.typicode.com/users")
//       .get("http://localhost:8080/")
//       .then(response => {
//         // create an array of phones only with relevant data
//         const newContacts = response.data.map(c => {
//           return {
//             id: c.id,
//             name: c.name,
//             image: c.imageFileName,
//           };

//         });

//         // create a new "state" object without mutating
//         // the original state object.
//         const newState = Object.assign({}, this.state, {
//           contacts: newContacts
//         });

//         // store the new state object in the component's state
//         this.setState(newState);
//       })
//       .catch(error => console.log(error));
//   }

//   render() {
//     return (
//       <div className="App">
//         <header className="App-header">
// 		    <Link to={"/"}><img src={logo} className="App-logo" alt="logo"/></Link>
//         <h1 className="App-title">Phone Details</h1>
//         <LeID/>
//         </header>
//       </div>
//     );
//   }
// }

const Details = ({ id }) => (
  <div className="App">
        <header className="App-header">
		    <Link to={"/"}><img src={logo} className="App-logo" alt="logo"/></Link>
        <h1 className="App-title">Phone Details</h1>
        <text>ID: {id}</text>
        </header>
        <LeID id={id}/>
  </div>
);

function mapStateToProps(state) {
  return {
      id: selectActiveID(state),
  }
}

const mapDispatchToProps = {
  dispatchUpdateWord: (id) => updateWord(id)
};

export default connect(mapStateToProps, mapDispatchToProps)(Details);