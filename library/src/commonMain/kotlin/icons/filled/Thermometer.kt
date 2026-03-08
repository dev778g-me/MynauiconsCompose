package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Thermometer: ImageVector
    get() {
        if (_Thermometer != null) {
            return _Thermometer!!
        }
        _Thermometer = ImageVector.Builder(
            name = "Filled.Thermometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                curveToRelative(-0.72f, 0f, -1.417f, 0.276f, -1.935f, 0.775f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.25f, 4.93f)
                verticalLineToRelative(8.426f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.463f, 1.646f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.532f, 2.352f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.513f, 3.166f)
                arcToRelative(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.339f, 1.23f)
                arcToRelative(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.279f, -1.375f)
                arcToRelative(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.364f, -3.23f)
                arcToRelative(4.56f, 4.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.587f, -2.235f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.413f, -1.554f)
                verticalLineTo(4.93f)
                curveToRelative(0f, -0.72f, -0.297f, -1.404f, -0.815f, -1.904f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
            }
        }.build()

        return _Thermometer!!
    }

@Suppress("ObjectPropertyName")
private var _Thermometer: ImageVector? = null
