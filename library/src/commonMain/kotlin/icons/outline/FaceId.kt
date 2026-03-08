package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FaceId: ImageVector
    get() {
        if (_FaceId != null) {
            return _FaceId!!
        }
        _FaceId = ImageVector.Builder(
            name = "Outline.FaceId",
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
                moveTo(11f, 13.75f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                moveToRelative(4f, -0.25f)
                verticalLineTo(8f)
                moveToRelative(-7f, 8.5f)
                curveToRelative(1.5f, 1.5f, 4.5f, 1.5f, 6f, 0f)
                moveToRelative(-7f, -7f)
                verticalLineTo(8f)
                moveToRelative(1.4f, 13f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, -1.748f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                moveToRelative(18f, 0f)
                curveToRelative(0f, 2.24f, 0f, 3.36f, -0.436f, 4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.748f, 1.748f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                moveToRelative(0f, -18f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.748f, 1.748f)
                curveTo(21f, 6.04f, 21f, 7.16f, 21f, 9.4f)
                moveTo(9.4f, 3f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.748f, 1.748f)
                curveTo(3f, 6.04f, 3f, 7.16f, 3f, 9.4f)
            }
        }.build()

        return _FaceId!!
    }

@Suppress("ObjectPropertyName")
private var _FaceId: ImageVector? = null
