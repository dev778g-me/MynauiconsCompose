package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Chrome: ImageVector
    get() {
        if (_Chrome != null) {
            return _Chrome!!
        }
        _Chrome = ImageVector.Builder(
            name = "Outline.Chrome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(10.992f, 20.946f)
                lineToRelative(4.122f, -7.146f)
                moveTo(4.755f, 6.654f)
                lineTo(8.886f, 13.8f)
                moveToRelative(11.367f, -5.4f)
                horizontalLineTo(12f)
                moveToRelative(0f, 7.2f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -7.2f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -18f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18f)
            }
        }.build()

        return _Chrome!!
    }

@Suppress("ObjectPropertyName")
private var _Chrome: ImageVector? = null
