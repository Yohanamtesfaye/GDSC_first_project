import React from 'react'
import EditTodoForm from './EditTodoForm'

const Todo = ({todos}) => {
  return (
    <div>
              {/* lists of the task */}
              <ul className="list">
          {todos.length===0 && "No todos"}
          {todos.map(todo =>{
            return(
              <EditTodoForm id={todo.id} completed={todo.completed} title={todo.title} key={todo.id}/>
          )
          })}
        </ul>
    </div>
  )
}

export default Todo