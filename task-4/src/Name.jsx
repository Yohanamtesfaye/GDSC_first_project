import React from "react";
import './Name.css'
const listofNames = ['name1', 'name2', 'name3', 'name4', 'name5','name6','name7','name8','name9','name10'];

function Name() {
  return (
    <div>
      <ul>
        {listofNames.map((member, index) => (
          <li key={index}>{member}</li>
        ))}
      </ul>
    </div>
  );
};

export default Name;