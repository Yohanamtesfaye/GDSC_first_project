import React from 'react'

const EditTodoForm = ({completed, id,title}) => {
  return (
    <div>
        <li>
              <label>
                <input 
                type="checkbox" checked={completed} 
                // onChange={e => toggleTodo(id, e.target.checked)}
                />
                  {title}
              </label>
              <button 
              // onClick={()=>deleteTodo(id)} 
              >
                Delete</button>
          </li>
    </div>
  )
}

export default EditTodoForm