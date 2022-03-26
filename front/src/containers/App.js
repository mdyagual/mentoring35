import React, { Component, useState } from 'react'
import From from '../components/From'
import Result from '../components/Result'

class App extends Component {// component stateful
  render() {
    
    return (
      <div>
        <h3>Random DEMO</h3>
        <p>Lanzamiento de dados</p>
        <From />
        <Result />
      </div>
    )
  }
}

export default App
