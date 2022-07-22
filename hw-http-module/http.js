const http = require('http');

http.createServer((req, res) => {
    
    if(req.url=='/') {
        res.write('<h1>index</h1>');
    }
    else if(req.url=='/hakkimda') {
        res.write('<h1>Hakkımda</h1>');
    }
    else if(req.url=='/iletisim') {
        res.write('<h1>İletişim</h1>');
    }

    else{
        res.write('<h1>404</h1>');
    }
res.end();

}).listen(5000)
console.log('Server running at http://localhost:5000/');