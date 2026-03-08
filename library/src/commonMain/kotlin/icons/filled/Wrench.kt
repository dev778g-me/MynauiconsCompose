package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Wrench: ImageVector
    get() {
        if (_Wrench != null) {
            return _Wrench!!
        }
        _Wrench = ImageVector.Builder(
            name = "Filled.Wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.598f, 2.343f)
                arcToRelative(6.433f, 6.433f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.419f, 7.5f)
                curveToRelative(-0.125f, 0.682f, 0.008f, 1.28f, 0.359f, 1.63f)
                lineToRelative(5.566f, 5.567f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.902f, 3.902f)
                lineToRelative(-5.566f, -5.566f)
                curveToRelative(-0.35f, -0.35f, -0.949f, -0.484f, -1.63f, -0.36f)
                arcToRelative(6.434f, 6.434f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.5f, -7.418f)
                arcToRelative(1.495f, 1.495f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.154f, -1.226f)
                curveToRelative(0.54f, -0.123f, 1.133f, 0.04f, 1.56f, 0.467f)
                lineToRelative(2.545f, 2.544f)
                arcToRelative(0.197f, 0.197f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.272f, 0f)
                lineToRelative(1.508f, -1.508f)
                arcToRelative(0.197f, 0.197f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.272f)
                lineTo(6.84f, 5.058f)
                arcToRelative(1.69f, 1.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.467f, -1.56f)
                curveToRelative(0.127f, -0.56f, 0.562f, -1.04f, 1.226f, -1.155f)
            }
        }.build()

        return _Wrench!!
    }

@Suppress("ObjectPropertyName")
private var _Wrench: ImageVector? = null
