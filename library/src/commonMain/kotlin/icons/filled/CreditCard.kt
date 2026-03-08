package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) {
            return _CreditCard!!
        }
        _CreditCard = ImageVector.Builder(
            name = "Filled.CreditCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.83f, 4.25f)
                horizontalLineTo(6.17f)
                curveToRelative(-0.534f, 0f, -0.98f, 0f, -1.345f, 0.03f)
                curveToRelative(-0.38f, 0.03f, -0.736f, 0.098f, -1.074f, 0.27f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.201f, 1.2f)
                curveToRelative(-0.172f, 0.338f, -0.24f, 0.694f, -0.27f, 1.074f)
                curveToRelative(-0.03f, 0.365f, -0.03f, 0.81f, -0.03f, 1.345f)
                verticalLineToRelative(7.66f)
                curveToRelative(0f, 0.535f, 0f, 0.98f, 0.03f, 1.345f)
                curveToRelative(0.03f, 0.38f, 0.098f, 0.736f, 0.27f, 1.073f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.201f, 1.203f)
                curveToRelative(0.337f, 0.171f, 0.694f, 0.238f, 1.073f, 0.27f)
                curveToRelative(0.364f, 0.029f, 0.81f, 0.029f, 1.342f, 0.029f)
                horizontalLineToRelative(11.668f)
                curveToRelative(0.533f, 0f, 0.978f, 0f, 1.341f, -0.03f)
                curveToRelative(0.38f, -0.03f, 0.736f, -0.098f, 1.073f, -0.27f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.203f, -1.202f)
                curveToRelative(0.171f, -0.337f, 0.238f, -0.693f, 0.27f, -1.072f)
                curveToRelative(0.029f, -0.364f, 0.029f, -0.809f, 0.029f, -1.342f)
                verticalLineTo(8.166f)
                curveToRelative(0f, -0.533f, 0f, -0.978f, -0.03f, -1.342f)
                curveToRelative(-0.03f, -0.38f, -0.098f, -0.736f, -0.27f, -1.073f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.202f, -1.201f)
                curveToRelative(-0.337f, -0.172f, -0.694f, -0.24f, -1.074f, -0.27f)
                curveToRelative(-0.363f, -0.03f, -0.81f, -0.03f, -1.343f, -0.03f)
                moveTo(4.433f, 5.886f)
                curveToRelative(0.09f, -0.046f, 0.228f, -0.088f, 0.515f, -0.111f)
                curveToRelative(0.296f, -0.024f, 0.68f, -0.025f, 1.253f, -0.025f)
                horizontalLineToRelative(11.6f)
                curveToRelative(0.573f, 0f, 0.957f, 0f, 1.252f, 0.025f)
                curveToRelative(0.287f, 0.023f, 0.424f, 0.065f, 0.515f, 0.111f)
                curveToRelative(0.236f, 0.12f, 0.427f, 0.312f, 0.547f, 0.546f)
                curveToRelative(0.046f, 0.09f, 0.088f, 0.228f, 0.111f, 0.515f)
                curveToRelative(0.024f, 0.295f, 0.025f, 0.679f, 0.025f, 1.25f)
                verticalLineToRelative(0.053f)
                horizontalLineTo(3.75f)
                verticalLineTo(8.2f)
                curveToRelative(0f, -0.572f, 0f, -0.957f, 0.025f, -1.253f)
                curveToRelative(0.023f, -0.287f, 0.065f, -0.424f, 0.111f, -0.515f)
                curveToRelative(0.12f, -0.235f, 0.311f, -0.426f, 0.546f, -0.546f)
                moveTo(6f, 14.25f)
                horizontalLineToRelative(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
            }
        }.build()

        return _CreditCard!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCard: ImageVector? = null
