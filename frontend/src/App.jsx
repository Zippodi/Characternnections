import { useEffect, useState } from 'react'
import axios from 'axios'

function App() {
  const [message, setMessage] = useState("")

  useEffect(() => {
    axios.get('http://localhost:8080/api/health')
      .then(res => setMessage(res.data))
      .catch(() => setMessage("Backend not connected"))
  }, [])

  return (
    <>
      <h1>Characternections</h1>
      <p>{message}</p>
    </>
  )
}

export default App
