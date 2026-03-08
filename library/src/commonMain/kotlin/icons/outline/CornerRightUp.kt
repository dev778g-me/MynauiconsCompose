package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CornerRightUp: ImageVector
    get() {
        if (_CornerRightUp != null) {
            return _CornerRightUp!!
        }
        _CornerRightUp = ImageVector.Builder(
            name = "Outline.CornerRightUp",
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
                moveTo(13.973f, 5f)
                verticalLineToRelative(10f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                horizontalLineTo(5f)
                moveToRelative(8.973f, -14f)
                lineTo(8.946f, 9.78f)
                moveTo(13.973f, 5f)
                lineTo(19f, 9.78f)
            }
        }.build()

        return _CornerRightUp!!
    }

@Suppress("ObjectPropertyName")
private var _CornerRightUp: ImageVector? = null
