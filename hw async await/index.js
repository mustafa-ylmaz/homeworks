const data = [{
    id: 1,
    name: 'post 1',
    content: 'content 1',
}, {
    id: 2,
    name: 'post 2',
    content: 'content 2',
}, {
    id: 3,
    name: 'post 3',
    content: 'content 3',
}];


function getList() {
    return data.map(item => {
        console.log(item.name);
    });
}

getList()
console.log('------------------');
const addNewPost = (post) => {
    const promise = new Promise((resolve, reject) => {
        data.push(post);
        resolve();
    });
    return promise;
}



async function showPost() {
    try {
        await addNewPost({
            id: 4,
            name: 'post 4',
            content: 'content 4',
        });
        getList();
    } catch (error) {
        console.log(error);
    }
}


showPost();
