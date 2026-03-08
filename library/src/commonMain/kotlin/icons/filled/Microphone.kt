package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Microphone: ImageVector
    get() {
        if (_Microphone != null) {
            return _Microphone!!
        }
        _Microphone = ImageVector.Builder(
            name = "Filled.Microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                curveToRelative(-2.51f, 0f, -4.75f, 1.767f, -4.75f, 4.179f)
                verticalLineToRelative(5.142f)
                curveToRelative(0f, 2.412f, 2.24f, 4.179f, 4.75f, 4.179f)
                reflectiveCurveToRelative(4.75f, -1.767f, 4.75f, -4.179f)
                verticalLineTo(6.43f)
                curveToRelative(0f, -2.412f, -2.24f, -4.179f, -4.75f, -4.179f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.75f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7.714f)
                verticalLineToRelative(1.536f)
                horizontalLineTo(8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-1.536f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -7.714f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                arcToRelative(6.25f, 6.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.5f, 0f)
            }
        }.build()

        return _Microphone!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone: ImageVector? = null
