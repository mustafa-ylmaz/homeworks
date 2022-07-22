const fs = require('fs');

fs.writeFileSync('employees.json', '[{"name": "Employee 1 Name", "salary": 2000}', (err) => {
    if (err) {
        console.log(err);
    }
})

fs.readFileSync('employees.json', (err, data) => {
    if (err) {
        console.log(err);
    }
})

fs.appendFileSync('employees.json', ','+'{"name": "Employee 2 Name", "salary": 3000}]', (err) => {
    if (err) {
        console.log(err);
    }
})

fs.unlinkSync('employees.json', (err) => {
    if (err) {
        console.log(err);
    }
})

