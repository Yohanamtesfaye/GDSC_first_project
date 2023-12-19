import React, {useState} from 'react'
import TodoForm from './TodoForm'
import { v4 as uuidv4 } from "uuid";
uuidv4()
const TodoRapper = () => {
  const [todos, settodos]= useState([])
  const addTodo = (todo)=>{
    settodos([...todos,{id:uuidv4(),todo, completed:false, isediting:false}])
  }
  return (
    <div className='todo-rapper'>
        <TodoForm addTodo ={addTodo}/>
    </div>
  
  )
}

export default TodoRapper