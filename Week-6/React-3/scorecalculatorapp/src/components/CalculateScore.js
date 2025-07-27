import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {
  const { name, school, total, goal } = props;

  const average = total / goal;

  return (
    <div className="score">
      <h1>Student Details: </h1>
      <p className="p1">Name: {name}</p>
      <p className="p2">School: {school}</p>
      <p className="p3">Total Marks: {total}</p>
      <p className="p4">Goal Marks: {goal}</p>
      <p className="p5">Average Score: {average}</p>
    </div>
  );
}
export default CalculateScore;
