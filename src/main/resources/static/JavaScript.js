    let tasks = [
    {id: 12, Desc: "Cleaning", ExpectedTime: "15 min", RealTime: "17 min", Gate: 4},
    {id: 13, Desc: "Gas", ExpectedTime: "10 min", RealTime: "9 min", Gate: 4},
    {id: 14, Desc: "Getting passagers out", ExpectedTime: "25 min", RealTime: "37 min", Gate: 4},
    {id: 14, Desc: "Getting passagers out", ExpectedTime: "25 min", RealTime: "37 min", Gate: 4},
    {id: 14, Desc: "Getting passagers out", ExpectedTime: "25 min", RealTime: "37 min", Gate: 4},
    {id: 14, Desc: "Getting passagers out", ExpectedTime: "25 min", RealTime: "37 min", Gate: 4},
    {id: 14, Desc: "Getting passagers out", ExpectedTime: "25 min", RealTime: "37 min", Gate: 4}
    ]

    function makeRows() {
    const rows = tasks.map(t =>`
        <tr>
            <td>${t.id}</td>
            <td>${t.Desc}</td>
            <td>${t.ExpectedTime}</td>
            <td>${t.RealTime}</td>
            <td>${t.Gate}</td>
            <td><button type="button" class="btn btn-info" data-toggle="modal" data-target="#task-modal">View Event</button></td>
        </tr>
            `)
    document.getElementById("task-table-body").innerHTML = rows.join("")
}
    makeRows()

    const yellowMouseover = document.getElementById("midterHeader")

    yellowMouseover.onmouseover = function(event){
    event.target.style.color = 'yellow';
}

    function handler(){
    document.getElementById("task-table-body").onclick = deleteFunc
}
    handler()

    function showModal(task) {
    const myModal = new bootstrap.Modal(document.getElementById('task-modal'))
    document.getElementById("input-desc").value = task.Desc
    document.getElementById("input-note").value = "Note"
    myModal.show()
}