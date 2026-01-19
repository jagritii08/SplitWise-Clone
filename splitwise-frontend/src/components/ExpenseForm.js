
import axios from "axios";
import {useState} from "react";

function ExpenseForm(){
 const [desc,setDesc]=useState("");
 const [amt,setAmt]=useState("");

 const add=()=>{
  axios.post("http://localhost:8080/api/expenses",{
   description:desc,
   amount:amt
  });
 }

 return(
  <div>
   <h3>Add Expense</h3>
   <input placeholder="Description" onChange={e=>setDesc(e.target.value)}/>
   <input placeholder="Amount" onChange={e=>setAmt(e.target.value)}/>
   <button onClick={add}>Add</button>
  </div>
 );
}
export default ExpenseForm;
