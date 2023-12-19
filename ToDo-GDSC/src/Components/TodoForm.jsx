import React, { useState } from 'react'

const TodoForm = ({onSubmit}) => {
 
  
  const [newItem, setNewItem] =  useState("")
  function handleSubmit (e){
    e.preventDefault()
    // add the tasks 
    if(newItem ==="") return 
    
    onSubmit(newItem)
   
   setNewItem("")
  }
  return (
    <>
      {/* handels the submission of a task */}
      <form className="new-item-form" onSubmit={handleSubmit}>
        <div className="form-row"> 
          {/* input tasks */}
          <label htmlFor="item">New Item: </label> <br />
          <input value={newItem}
            type="text" id="item" placeholder="What are the tasks for today?"
          // take the value of the input 
          onChange={(e)=>setNewItem(e.target.value)}
        />
      </div>
        <button className="btn">Add Task</button>
    </form>
    </>
  )
}

export default TodoForm