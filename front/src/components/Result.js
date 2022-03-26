import React, {useState} from 'react'
import { connect } from 'react-redux';



function randomRoll(sides = 6) {
  return Math.floor(Math.random() * sides) + 1;
}




export const Result = (props) => {
  

  return <div>   
     {props.result && 'Número obenido: '+randomRoll()}
      
     
  </div>
}


const stateMapToPros = (state) => {
  return {
    result: state.random.result?.dado
  }
}


export default connect(stateMapToPros)(Result)
