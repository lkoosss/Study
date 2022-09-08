const searchEl = document.querySelector('.search');
const searchInputEl = searchEl.querySelector('input');

searchEl.addEventListener('click',() => {
    searchInputEl.focus();
});

searchInputEl.addEventListener('focus', () => {
    searchEl.classList.add('focused');
    searchInputEl.setAttribute('placeholder','통합검색');
});

searchInputEl.addEventListener('blur', () => {
    searchEl.classList.remove('focused');
    searchInputEl.setAttribute('placeholder','');
});

const badgeEl = document.querySelector('header .badges');

window.addEventListener('scroll', _.throttle(() => {
    console.log(window.scrollY);
    if (window.scrollY > 500) {
        // 배지 숨기기
        gsap.to(badgeEl, 0.6, {
            opacity: 0,
            display: 'none'
        });
    } else {
        // 배지 보이기
        gsap.to(badgeEl, 0.6, {
            opacity: 1,
            display: 'block'
        })
    }
}, 300));