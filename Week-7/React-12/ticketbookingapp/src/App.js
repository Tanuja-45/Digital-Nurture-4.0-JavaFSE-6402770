import React, { Component } from 'react';
import Guest from './components/Guest';
import User from './components/User';
class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }
  loginHandler = () => {
    this.setState({ isLoggedIn: true });
  };
  logoutHandler = () => {
    this.setState({ isLoggedIn: false });
  };
  render() {
    const { isLoggedIn } = this.state;
    let content;
    let button;

    if (isLoggedIn) {
      content = <User />;
      button = <button onClick={this.logoutHandler}>Logout</button>;
    } else {
      content = <Guest />;
      button = <button onClick={this.loginHandler}>Login</button>;
    }
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>Ticket Booking App</h1>
        {button}
        <hr />
        {content}
      </div>
    );
  }
}
export default App;
