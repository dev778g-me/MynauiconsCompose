package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BookImage: ImageVector
    get() {
        if (_BookImage != null) {
            return _BookImage!!
        }
        _BookImage = ImageVector.Builder(
            name = "Outline.BookImage",
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
                moveTo(8.5f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                moveTo(19f, 9.133f)
                curveToRelative(-4.304f, 0.938f, -7.595f, 4.408f, -7.98f, 8.867f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12.066f)
                curveToRelative(2.78f, -0.385f, 5.275f, 0.958f, 6.624f, 3.1f)
            }
        }.build()

        return _BookImage!!
    }

@Suppress("ObjectPropertyName")
private var _BookImage: ImageVector? = null
