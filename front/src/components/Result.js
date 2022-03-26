import React, {useState} from 'react'
import { connect } from 'react-redux';



/*function randomRoll(sides = 6) {
  return Math.floor(Math.random() * sides) + 1;
}*/




export const Result = (state) => {
  
  const [rolledValue, setRolledValue] = useState(0);
  const [rolledValue2,setRolledValue2] = useState(0);

  const roll1 = () => {
    setRolledValue(Math.ceil(Math.random() * 5 + 1));
  };

  const roll2 = () => {
    setRolledValue2(Math.ceil(Math.random() * 5 + 1));
  };
  
  return <div>   
      <p>rolled dice value: {rolledValue}</p>
      <button onClick={roll1}>Roll</button>
      <br/>
      <p>rolled dice value: {rolledValue2}</p>
      <button onClick={roll2}>Roll</button>      
     
  </div>
}


const stateMapToPros = (state) => {
  return {
    
  }
}


export default connect(stateMapToPros)(Result)
