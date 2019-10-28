# To Reproduce

1. Run `$ npm install`
2. Run `$ ./shadow-cljs.sh watch browser-extension`
3. Add the extension to Chrome via `Load unpacked` (in `Developer mode`), selecting the `build/unpacked-browser-extension` directory)
4. Visit any website and open the developer console
4. Modify `src/content_script.cljs` and save. Check the console for:
```
shadow-cljs: can't find fn background/stop
```
and
```
shadow-cljs: can't find fn background/start
```
