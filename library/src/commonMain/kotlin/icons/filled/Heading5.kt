package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Heading5: ImageVector
    get() {
        if (_Heading5 != null) {
            return _Heading5!!
        }
        _Heading5 = ImageVector.Builder(
            name = "Filled.Heading5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(8f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(17.466f, 5.526f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.492f, 0.94f)
                curveToRelative(-1.137f, 0.355f, -2.375f, 0.347f, -3.29f, 0.265f)
                quadToRelative(-0.377f, -0.034f, -0.684f, -0.08f)
                verticalLineToRelative(1.915f)
                horizontalLineToRelative(2.028f)
                curveToRelative(1.689f, 0f, 2.972f, 1.448f, 2.972f, 3.127f)
                verticalLineToRelative(1.399f)
                curveToRelative(0f, 1.07f, -0.386f, 1.936f, -1.016f, 2.532f)
                arcToRelative(3.26f, 3.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.23f, 0.876f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.238f, -0.863f)
                curveToRelative(-0.632f, -0.597f, -1.016f, -1.467f, -1.016f, -2.545f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                curveToRelative(0f, 0.705f, 0.241f, 1.167f, 0.546f, 1.454f)
                curveToRelative(0.315f, 0.297f, 0.749f, 0.456f, 1.2f, 0.454f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.207f, -0.465f)
                curveToRelative(0.308f, -0.291f, 0.547f, -0.752f, 0.547f, -1.443f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -0.946f, -0.706f, -1.626f, -1.472f, -1.626f)
                horizontalLineTo(16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineTo(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.931f, -0.728f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(0.003f)
                lineToRelative(0.016f, 0.005f)
                lineToRelative(0.072f, 0.016f)
                quadToRelative(0.099f, 0.023f, 0.286f, 0.057f)
                curveToRelative(0.247f, 0.046f, 0.599f, 0.1f, 1.009f, 0.137f)
                curveToRelative(0.834f, 0.075f, 1.846f, 0.067f, 2.71f, -0.203f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.939f, 0.492f)
            }
        }.build()

        return _Heading5!!
    }

@Suppress("ObjectPropertyName")
private var _Heading5: ImageVector? = null
