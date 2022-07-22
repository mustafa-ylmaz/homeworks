const Koa = require('koa');
const koaRouter = require('koa-router');
const app = new Koa();

const router = new koaRouter();



router.get('index','/index',(ctx)=>{
    ctx.body = "<h1>Index</h1>"
})

router.get('about','/about',(ctx)=>{
    ctx.body = "<h1>Hakkimda</h1>"
})

router.get('contact','/contact',(ctx)=>{
    ctx.body = "<h1>Iletisim</h1>"
})





app.use(router.routes())
.use(router.allowedMethods());


app.listen(3000,()=>{
    console.log(`Server Running on port 3000`);
});