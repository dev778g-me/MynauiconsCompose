package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BookHome: ImageVector
    get() {
        if (_BookHome != null) {
            return _BookHome!!
        }
        _BookHome = ImageVector.Builder(
            name = "Outline.BookHome",
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
                moveTo(5f, 20.25f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(10.652f)
                curveTo(17.565f, 21f, 18f, 20.635f, 18f, 19.4f)
                verticalLineToRelative(-1.445f)
                moveTo(5f, 20.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.25f, 18f)
                horizontalLineToRelative(10.152f)
                quadToRelative(0.339f, 0f, 0.598f, -0.045f)
                moveTo(5f, 20.25f)
                verticalLineTo(6.2f)
                curveToRelative(0f, -1.136f, -0.072f, -2.389f, 1.092f, -2.982f)
                curveTo(6.52f, 3f, 7.08f, 3f, 8.2f, 3f)
                horizontalLineToRelative(9.2f)
                curveToRelative(1.236f, 0f, 1.6f, 0.437f, 1.6f, 1.6f)
                verticalLineToRelative(11.8f)
                curveToRelative(0f, 0.995f, -0.282f, 1.425f, -1f, 1.555f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.75f, 12.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(9.14f)
                lineTo(12f, 7.5f)
                lineToRelative(2.25f, 1.64f)
                verticalLineToRelative(2.36f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
            }
        }.build()

        return _BookHome!!
    }

@Suppress("ObjectPropertyName")
private var _BookHome: ImageVector? = null
