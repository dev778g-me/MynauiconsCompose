package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Gitlab: ImageVector
    get() {
        if (_Gitlab != null) {
            return _Gitlab!!
        }
        _Gitlab = ImageVector.Builder(
            name = "Filled.Gitlab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.168f, 2.645f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.39f, 0.184f)
                lineTo(2.27f, 13.537f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.257f, 0.753f)
                lineToRelative(8.982f, 7.292f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.944f, 0.001f)
                lineToRelative(9.019f, -7.292f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.258f, -0.754f)
                lineTo(19.228f, 2.829f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -0.145f)
                lineToRelative(-2.814f, 6.063f)
                horizontalLineTo(9.445f)
                close()
            }
        }.build()

        return _Gitlab!!
    }

@Suppress("ObjectPropertyName")
private var _Gitlab: ImageVector? = null
