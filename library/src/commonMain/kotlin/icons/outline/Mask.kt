package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Mask: ImageVector
    get() {
        if (_Mask != null) {
            return _Mask!!
        }
        _Mask = ImageVector.Builder(
            name = "Outline.Mask",
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
                moveToRelative(5.7f, 8.77f)
                lineToRelative(5.175f, -1.517f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 0f)
                lineTo(18.3f, 8.769f)
                moveToRelative(-12.6f, 0f)
                verticalLineTo(7.35f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.7f, 0f)
                verticalLineToRelative(2.188f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(0.7f)
                moveToRelative(0f, -2.769f)
                verticalLineToRelative(2.77f)
                moveToRelative(12.6f, -2.77f)
                verticalLineToRelative(2.77f)
                moveToRelative(0f, -2.77f)
                verticalLineTo(7.35f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.7f, 0f)
                verticalLineToRelative(2.188f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-0.7f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(0.162f)
                arcToRelative(6.3f, 6.3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.6f, 0f)
                verticalLineToRelative(-0.161f)
            }
        }.build()

        return _Mask!!
    }

@Suppress("ObjectPropertyName")
private var _Mask: ImageVector? = null
