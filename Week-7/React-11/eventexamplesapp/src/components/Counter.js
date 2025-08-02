import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
    this.handleClick = this.handleClick.bind(this);
  }
  increment = () => {
    this.setState((prevState) => ({ count: prevState.count + 1 }));
    this.sayHello();
  };
  sayHello = () => {
    alert("Hello! This is a static greeting after incrementing.");
  };
  decrement = () => {
    this.setState((prevState) => ({ count: prevState.count - 1 }));
  };
  sayWelcome = (message) => {
    alert(`Message: ${message}`);
  };
  handleClick(event) {
    alert("I was clicked"); 
  }
  render() {
    return (
      <div>
        <h2>Counter Value: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to React Events!")}>
          Say Welcome
        </button>
        <br /><br />
        <button onClick={this.handleClick}>Click Me (Synthetic Event)</button>
      </div>
    );
  }
}

export default Counter;
