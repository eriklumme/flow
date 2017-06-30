/*
 * Copyright 2000-2017 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.components.paper.icon.button;

import com.vaadin.ui.Component;
import javax.annotation.Generated;
import com.vaadin.annotations.Tag;
import com.vaadin.annotations.HtmlImport;
import elemental.json.JsonObject;
import com.vaadin.components.NotSupported;
import com.vaadin.annotations.DomEvent;
import com.vaadin.ui.ComponentEvent;
import com.vaadin.flow.event.ComponentEventListener;
import com.vaadin.shared.Registration;

/**
 * 
 */
@Generated({
		"Generator: com.vaadin.generator.ComponentGenerator#0.1.12-SNAPSHOT",
		"WebComponent: paper-icon-button#2.0.0", "Flow#0.1.12-SNAPSHOT"})
@Tag("paper-icon-button")
@HtmlImport("frontend://bower_components/paper-icon-button/paper-icon-button.html")
public class PaperIconButton<R extends PaperIconButton<R>> extends Component {

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * The EventTarget that will be firing relevant KeyboardEvents. Set it to
	 * {@code null} to disable the listeners.
	 */
	public JsonObject getKeyEventTarget() {
		return (JsonObject) getElement().getPropertyRaw("keyEventTarget");
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * The EventTarget that will be firing relevant KeyboardEvents. Set it to
	 * {@code null} to disable the listeners.
	 * 
	 * @param keyEventTarget
	 * @return This instance, for method chaining.
	 */
	public R setKeyEventTarget(elemental.json.JsonObject keyEventTarget) {
		getElement().setPropertyJson("keyEventTarget", keyEventTarget);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, this property will cause the implementing element to
	 * automatically stop propagation on any handled KeyboardEvents.
	 */
	public boolean isStopKeyboardEventPropagation() {
		return getElement().getProperty("stopKeyboardEventPropagation", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, this property will cause the implementing element to
	 * automatically stop propagation on any handled KeyboardEvents.
	 * 
	 * @param stopKeyboardEventPropagation
	 * @return This instance, for method chaining.
	 */
	public R setStopKeyboardEventPropagation(
			boolean stopKeyboardEventPropagation) {
		getElement().setProperty("stopKeyboardEventPropagation",
				stopKeyboardEventPropagation);
		return getSelf();
	}

	public JsonObject getKeyBindings() {
		return (JsonObject) getElement().getPropertyRaw("keyBindings");
	}

	/**
	 * @param keyBindings
	 * @return This instance, for method chaining.
	 */
	public R setKeyBindings(elemental.json.JsonObject keyBindings) {
		getElement().setPropertyJson("keyBindings", keyBindings);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the user is currently holding down the button.
	 */
	public boolean isPressed() {
		return getElement().getProperty("pressed", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the user is currently holding down the button.
	 * 
	 * @param pressed
	 * @return This instance, for method chaining.
	 */
	public R setPressed(boolean pressed) {
		getElement().setProperty("pressed", pressed);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the button toggles the active state with each tap or press of
	 * the spacebar.
	 */
	public boolean isToggles() {
		return getElement().getProperty("toggles", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the button toggles the active state with each tap or press of
	 * the spacebar.
	 * 
	 * @param toggles
	 * @return This instance, for method chaining.
	 */
	public R setToggles(boolean toggles) {
		getElement().setProperty("toggles", toggles);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the button is a toggle and is currently in the active state.
	 */
	public boolean isActive() {
		return getElement().getProperty("active", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the button is a toggle and is currently in the active state.
	 * 
	 * @param active
	 * @return This instance, for method chaining.
	 */
	public R setActive(boolean active) {
		getElement().setProperty("active", active);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * True if the element is currently being pressed by a "pointer," which is
	 * loosely defined as mouse or touch input (but specifically excluding
	 * keyboard input).
	 */
	public boolean isPointerDown() {
		return getElement().getProperty("pointerDown", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * True if the element is currently being pressed by a "pointer," which is
	 * loosely defined as mouse or touch input (but specifically excluding
	 * keyboard input).
	 * 
	 * @param pointerDown
	 * @return This instance, for method chaining.
	 */
	public R setPointerDown(boolean pointerDown) {
		getElement().setProperty("pointerDown", pointerDown);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * True if the input device that caused the element to receive focus was a
	 * keyboard.
	 */
	public boolean isReceivedFocusFromKeyboard() {
		return getElement().getProperty("receivedFocusFromKeyboard", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * True if the input device that caused the element to receive focus was a
	 * keyboard.
	 * 
	 * @param receivedFocusFromKeyboard
	 * @return This instance, for method chaining.
	 */
	public R setReceivedFocusFromKeyboard(boolean receivedFocusFromKeyboard) {
		getElement().setProperty("receivedFocusFromKeyboard",
				receivedFocusFromKeyboard);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * The aria attribute to be set if the button is a toggle and in the active
	 * state.
	 */
	public String getAriaActiveAttribute() {
		return getElement().getProperty("ariaActiveAttribute");
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * The aria attribute to be set if the button is a toggle and in the active
	 * state.
	 * 
	 * @param ariaActiveAttribute
	 * @return This instance, for method chaining.
	 */
	public R setAriaActiveAttribute(java.lang.String ariaActiveAttribute) {
		getElement().setProperty("ariaActiveAttribute",
				ariaActiveAttribute == null ? "" : ariaActiveAttribute);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the element currently has focus.
	 */
	public boolean isFocused() {
		return getElement().getProperty("focused", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the element currently has focus.
	 * 
	 * @param focused
	 * @return This instance, for method chaining.
	 */
	public R setFocused(boolean focused) {
		getElement().setProperty("focused", focused);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the user cannot interact with this element.
	 */
	public boolean isDisabled() {
		return getElement().getProperty("disabled", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the user cannot interact with this element.
	 * 
	 * @param disabled
	 * @return This instance, for method chaining.
	 */
	public R setDisabled(boolean disabled) {
		getElement().setProperty("disabled", disabled);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the element will not produce a ripple effect when interacted
	 * with via the pointer.
	 */
	public boolean isNoink() {
		return getElement().getProperty("noink", false);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * If true, the element will not produce a ripple effect when interacted
	 * with via the pointer.
	 * 
	 * @param noink
	 * @return This instance, for method chaining.
	 */
	public R setNoink(boolean noink) {
		getElement().setProperty("noink", noink);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * The URL of an image for the icon. If the src property is specified, the
	 * icon property should not be.
	 */
	public String getSrc() {
		return getElement().getProperty("src");
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * The URL of an image for the icon. If the src property is specified, the
	 * icon property should not be.
	 * 
	 * @param src
	 * @return This instance, for method chaining.
	 */
	public R setSrc(java.lang.String src) {
		getElement().setProperty("src", src == null ? "" : src);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Specifies the icon name or index in the set of icons available in the
	 * icon's icon set. If the icon property is specified, the src property
	 * should not be.
	 */
	public String getIcon() {
		return getElement().getProperty("icon");
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Specifies the icon name or index in the set of icons available in the
	 * icon's icon set. If the icon property is specified, the src property
	 * should not be.
	 * 
	 * @param icon
	 * @return This instance, for method chaining.
	 */
	public R setIcon(java.lang.String icon) {
		getElement().setProperty("icon", icon == null ? "" : icon);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Specifies the alternate text for the button, for accessibility.
	 */
	public String getAlt() {
		return getElement().getProperty("alt");
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Specifies the alternate text for the button, for accessibility.
	 * 
	 * @param alt
	 * @return This instance, for method chaining.
	 */
	public R setAlt(java.lang.String alt) {
		getElement().setProperty("alt", alt == null ? "" : alt);
		return getSelf();
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Can be used to imperatively add a key binding to the implementing
	 * element. This is the imperative equivalent of declaring a keybinding in
	 * the {@code keyBindings} prototype property.
	 * 
	 * @param eventString
	 * @param handlerName
	 */
	public void addOwnKeyBinding(java.lang.String eventString,
			java.lang.String handlerName) {
		getElement().callFunction("addOwnKeyBinding", eventString, handlerName);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * When called, will remove all imperatively-added key bindings.
	 */
	public void removeOwnKeyBindings() {
		getElement().callFunction("removeOwnKeyBindings");
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Returns true if a keyboard event matches {@code eventString}.
	 * 
	 * @param event
	 * @param eventString
	 * @return It would return a boolean
	 */
	@NotSupported
	protected void keyboardEventMatchesKeys(elemental.json.JsonObject event,
			java.lang.String eventString) {
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Ensures this element contains a ripple effect. For startup efficiency the
	 * ripple effect is dynamically on demand when needed.
	 * 
	 * @param optTriggeringEvent
	 */
	public void ensureRipple(elemental.json.JsonObject optTriggeringEvent) {
		getElement().callFunction("ensureRipple", optTriggeringEvent);
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Returns the {@code <paper-ripple>} element used by this element to create
	 * ripple effects. The element's ripple is created on demand, when
	 * necessary, and calling this method will force the ripple to be created.
	 */
	public void getRipple() {
		getElement().callFunction("getRipple");
	}

	/**
	 * Description copied from corresponding location in WebComponent:
	 * 
	 * Returns true if this element currently contains a ripple effect.
	 * 
	 * @return It would return a boolean
	 */
	@NotSupported
	protected void hasRipple() {
	}

	@DomEvent("active-changed")
	public static class ActiveChangedEvent
			extends
				ComponentEvent<PaperIconButton> {
		public ActiveChangedEvent(PaperIconButton source, boolean fromClient) {
			super(source, fromClient);
		}
	}

	public Registration addActiveChangedListener(
			ComponentEventListener<ActiveChangedEvent> listener) {
		return addListener(ActiveChangedEvent.class, listener);
	}

	@DomEvent("focused-changed")
	public static class FocusedChangedEvent
			extends
				ComponentEvent<PaperIconButton> {
		public FocusedChangedEvent(PaperIconButton source, boolean fromClient) {
			super(source, fromClient);
		}
	}

	public Registration addFocusedChangedListener(
			ComponentEventListener<FocusedChangedEvent> listener) {
		return addListener(FocusedChangedEvent.class, listener);
	}

	@DomEvent("disabled-changed")
	public static class DisabledChangedEvent
			extends
				ComponentEvent<PaperIconButton> {
		public DisabledChangedEvent(PaperIconButton source, boolean fromClient) {
			super(source, fromClient);
		}
	}

	public Registration addDisabledChangedListener(
			ComponentEventListener<DisabledChangedEvent> listener) {
		return addListener(DisabledChangedEvent.class, listener);
	}

	/**
	 * Gets the narrow typed reference to this object. Subclasses should
	 * override this method to support method chaining using the inherited type.
	 * 
	 * @return This object casted to its type.
	 */
	protected R getSelf() {
		return (R) this;
	}
}