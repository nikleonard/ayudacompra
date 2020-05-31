import React from "react";
import InitialScreen from "./app/screens/InitialScreen";
import RequestDashboardScreen from "./app/screens/RequestDashboardScreen";
import HelpRequestScreen from "./app/screens/HelpRequestScreen";
import CreateProductListScreen from "./app/screens/CreateProductListScreen";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";

const Stack = createStackNavigator();

const App = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="InitialScreen" component={InitialScreen} />
        <Stack.Screen
          name="RequestDashboardScreen"
          component={RequestDashboardScreen}
        />
        <Stack.Screen name = "HelpRequestScreen" 
          component={HelpRequestScreen} 
          options={{title:'Solicitar Ayuda en tu compra'}} 
        />
        <Stack.Screen name = "CreateProductListScreen" 
          component={CreateProductListScreen} 
          options={{title:'Añadir productos'}} 
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default App;
