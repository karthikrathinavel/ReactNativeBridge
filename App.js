import React, { useEffect } from 'react';
import {Text, View, TouchableOpacity, NativeModules} from 'react-native';
const App = () => {
  
  function show(){
    NativeModules.CustomModule.show();
  }
  return(
    <View>
    <Text>Sample</Text>
    <TouchableOpacity onPress={show}><Text>Button</Text></TouchableOpacity>
    </View>
  );
}
export default App;