package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BookmarkHome: ImageVector
    get() {
        if (_BookmarkHome != null) {
            return _BookmarkHome!!
        }
        _BookmarkHome = ImageVector.Builder(
            name = "Outline.BookmarkHome",
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
                moveTo(7.527f, 20.841f)
                curveTo(6.861f, 21.274f, 6f, 20.772f, 6f, 19.952f)
                verticalLineTo(3.942f)
                curveToRelative(0f, -0.52f, 0.336f, -0.942f, 0.75f, -0.942f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.414f, 0f, 0.75f, 0.422f, 0.75f, 0.942f)
                verticalLineToRelative(16.01f)
                curveToRelative(0f, 0.82f, -0.861f, 1.322f, -1.527f, 0.89f)
                lineToRelative(-3.946f, -2.562f)
                arcToRelative(0.96f, 0.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.054f, 0f)
                close()
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

        return _BookmarkHome!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkHome: ImageVector? = null
