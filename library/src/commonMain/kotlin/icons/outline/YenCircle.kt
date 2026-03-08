package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.YenCircle: ImageVector
    get() {
        if (_YenCircle != null) {
            return _YenCircle!!
        }
        _YenCircle = ImageVector.Builder(
            name = "Outline.YenCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                moveToRelative(-5.818f, 0.5f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.818f)
                moveToRelative(3.182f, 0f)
                lineToRelative(-3.5f, -5f)
                moveToRelative(3.5f, 5f)
                lineToRelative(3.5f, -5f)
                moveToRelative(-3.5f, 5f)
                verticalLineTo(15f)
                moveToRelative(3.182f, 0f)
                horizontalLineTo(12f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.818f)
                moveTo(12f, 15f)
                verticalLineToRelative(2.5f)
            }
        }.build()

        return _YenCircle!!
    }

@Suppress("ObjectPropertyName")
private var _YenCircle: ImageVector? = null
